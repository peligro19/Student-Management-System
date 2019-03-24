# Student-Management-System

This is a project to manage Students. Students can be managed by "Admins" after Successfull Login.

Operations Done by Admins:-\
*Admin Can "Add a New Student".\
*Admin Can "Delete an Existing Student".\
*Admin Can "Update Details of an Existing Student".\
*Admin Can "Search for an Existing Student".\
*Admin Can "Display All Students Details".\
\
*Admin Can "Add a New Admin".\
*Admin Can "Delete an Existing Admin".\
*Admin Can "Update Details of an Existing Admin".\
*Admin Can "Search for an Existing Admin".\
*Admin Can "Display All Students Admin".\
\
Database and Tables used:-\
*Database Name:- "Student".\
*Tables Name:- "Student" & "Admin".\
\
Structure of Tables:-\
\
                            Student Table\
+----------+-------------+------+-----+---------+----------------+\
| Field    | Type        | Null | Key | Default | Extra          |\
+----------+-------------+------+-----+---------+----------------+\
| id       | int(11)     | NO   | PRI | NULL    | auto_increment |\
| email    | varchar(50) | YES  |     | NULL    |                |\
| password | varchar(50) | YES  |     | NULL    |                |\
| name     | varchar(50) | YES  |     | NULL    |                |\
+----------+-------------+------+-----+---------+----------------+\
\
                             Admin Table\
+---------------+-------------+------+-----+---------+----------------+\
| Field         | Type        | Null | Key | Default | Extra          |\
+---------------+-------------+------+-----+---------+----------------+\
| id            | int(11)     | NO   | PRI | NULL    | auto_increment |\
| stdName       | varchar(50) | YES  |     | NULL    |                |\
| stdFatherName | varchar(50) | YES  |     | NULL    |                |\
| stdBlood      | varchar(50) | YES  |     | NULL    |                |\
| stdPhone      | varchar(50) | YES  |     | NULL    |                |\
| stdCity       | varchar(25) | YES  |     | NULL    |                |\
| class         | int(11)     | YES  |     | NULL    |                |\
+---------------+-------------+------+-----+---------+----------------+\
\
