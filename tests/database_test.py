import random
import sqlite3
import unittest

from database import Database


class DatabaseTest(unittest.TestCase):
    """
    Unit tests for the Database class.
    """
    def test_connecting_to_db(self):
        """
        Asserts that when connecting to the database, no exception is thrown.
        """
        try:
            database = Database("test.sqlite")
        except sqlite3.Error as e:
            self.fail(e)

    def test_executing_sql(self):
        """
        Asserts that when executing an SQL statement, no exception is thrown.
        """
        random_number = random.randint(0, 1000)
        sql = f"INSERT INTO test (number_field) VALUES ({random_number})"
