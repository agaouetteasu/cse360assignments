/*
 * Assignment1
 * Alex Gaouette 
 * agaouett@asu.edu
 * CSE 360 – #70606
 */

package cse360assignment02;

/**
 * Implementation of an adding machine capable of adding/subtracting integers.
 * @author Alex Gaouette <agaouett@asu.edu>
 */
public class AddingMachine {
	
  /**
   * Used for keeping track of the running total of all operations.
   */
  private int total;
  /**
   * Used for keeping track of the operation history of the adding machine.
   */
  private String history;
  
  /**
   * Constructor for the AddingMachine class.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "" + total;
  }
  
  /**
   * Used to get the current total.
   * @return total - current total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Adds an integer to the current total.
   * Updates the history of the adding machine to include the new operation.
   * @param value - an integer value to be added to the current total
   */
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }
  
  /**
   * Subtracts an integer from the current total.
   * Updates the history of the adding machine to include the new operation.
   * @param value - an integer value to be subtracted from the current total
   */
  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }
  
  /**
   * Returns the history of adding machine operations.
   */
  public String toString () {
    return history;
  }
  
  /**
   * Clears the adding machine history and total.
   */
  public void clear() {
	  total = 0;
	  history = "";
  }
}