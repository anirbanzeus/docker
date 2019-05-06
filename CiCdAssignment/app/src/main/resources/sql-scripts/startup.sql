create user 'user'@'%' identified by 'password'; -- Creates the user
grant all on test.* to 'user'@'%'; -- Gives all the privileges to the new user on the newly created database
