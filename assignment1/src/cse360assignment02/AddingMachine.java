/*
 * Assignment1
 * Alex Gaouette 
 * agaouett@asu.edu
 * CSE 360 – #70606
 */

package cse360assignment02;

/**
 * Implementation of an adding machine capable
 * adding and subtracting integers.
 */
public class AddingMachine {
	
  /**
   * Used for keeping track of the running total
   * of integers added
   */
  private int total;
  
  /**
   * Constructor for the AddingMachine class.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * Used to get the current total
   * @return total - current total
   */
  public int getTotal () {
    return 0;
  }
  
  /**
   * Adds an integer to the current total
   * @param value - an integer value to be added to the current total
   */
  public void add (int value) {
  }
  
  /**
   * Subtracts an integer from the current total
   * @param value - an integer value to be subtracted from the current total
   */
  public void subtract (int value) {
  }
  
  /**
   * Returns the history of adding machine operations
   */
  public String toString () {
    return "";
  }
  
  /**
   * Clears the adding machine history and total
   */
  public void clear() {
  }
}