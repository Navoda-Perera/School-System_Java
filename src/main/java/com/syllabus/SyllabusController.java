package com.syllabus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SyllabusController {

    private static List<Syllabus> syllabusList = new ArrayList<>();

    public static void addSyllabus(Syllabus syllabus) {
    	try (Connection connection = DBConnection.getConnection();
    	         PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO syllabus (subject, description) VALUES (?, ?)")){

             // Set the values for the PreparedStatement based on the Syllabus object
            preparedStatement.setString(1, syllabus.getSubject());
            preparedStatement.setString(2, syllabus.getDescription());

            // Execute the insert query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // Handle any database-related exceptions
            e.printStackTrace();
        }
    }

    public static List<Syllabus> getAllSyllabi() {
    	
    	try (Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("SELECT subject, description FROM syllabus");
                ResultSet resultSet = statement.executeQuery()) {

               while (resultSet.next()) {
                   String subject = resultSet.getString("subject");
                   String description = resultSet.getString("description");
                   Syllabus syllabus = new Syllabus(subject, description);
                   syllabusList.add(syllabus);
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
    	
        return syllabusList;
    }

    public static void updateSyllabus(String oldSubject, Syllabus newSyllabus) {
    	try (Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("UPDATE syllabus SET subject = ?, description = ? WHERE subject = ?")) {
               statement.setString(1, newSyllabus.getSubject());
               statement.setString(2, newSyllabus.getDescription());
               statement.setString(3, oldSubject);
               statement.executeUpdate();
           } catch (SQLException e) {
               e.printStackTrace(); // Handle exceptions properly in your application
           }
    }

    public static void deleteSyllabus(String subject) {
    	try (Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("DELETE FROM syllabus WHERE subject = ?")) {
               statement.setString(1, subject);
               statement.executeUpdate();
           } catch (SQLException e) {
               e.printStackTrace(); // Handle exceptions properly in your application
           }
       }
    }

