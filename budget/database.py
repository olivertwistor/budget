import sqlite3
from collections import Iterable


class Database:
    """
    This class handles connection to an SQLite database.

    :param db_path: path to the database to connect to
    """
    def __init__(self, db_path: str):
        """
        Connects to the app database.

        :raises sqlite3.Error: if the connection fails
        """
        self.connection = sqlite3.connect(db_path)

    def execute_statement(self, sql: str):
        """
        Executes an SQL statement.

        :param sql: the SQL statement to execute

        :raises sqlite3.Error: if there was something wrong with the SQL
        """
        cursor = self.connection.cursor()
        cursor.execute(sql)

    def execute_query(self, sql: str) -> Iterable:
        """

        :param sql:
        :return:
        """
