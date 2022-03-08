class Main {
  public static void main(String[] args) {

    // 6. Create a Tortoise object that utilized our Tortoise constructor which takes in the name, limbs and life. Assign those values in our object and get the return of. The name should be Baloo, limbs should be bent and stubby, and life should be 150 years. 
    Tortoise myTortoise = new Tortoise("Baloo", "flippers", 50);
    
    // 7. Call the whoAmI method using your Tortoise object.
    myTortoise.whoAmI();
    
    // 8. Create a Turtle object that utilized our Turtle constructor which takes in the name, limbs, life and breath. The Name should be Squirtle, limbs should be flippers, life should be 50 and breath should be 60.
    Turtle myTurtle = new Turtle("Squirtle", "flippers", 50, 60);

    // 9. Call the whoAmI method using your Turtle object.
    myTurtle.whoAmI();
  }
}