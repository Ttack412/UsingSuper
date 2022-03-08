class Turtle extends Reptile
{
  int breath;
  
  public Turtle(String name, String limbs, int life, int breath){
    super(name, limbs, life);
    this.breath = breath;
  }

  @Override
  public void whoAmI(){
    super.whoAmI();
    System.out.println(" and a turtle. My skin is " +  super.skin + "." + " I can hold my breath for " + breath + " minutes.");
  }
}



// 2. Create a class Turtle that inherits from Reptile. 

  // 3. Declare an instance variable named breath that will hold the length of time our turtle will hold it's breath. 

  // 4. Make a constructor that takes in the same parameters as the reptile constructor and then pass those parameters into the super constructor. Also add a parameter in the constructor for breath and then initialize it.

  // 5. Override the whoAmI() method. Make a super call to the parent method in the method body. Then create a print statement that states " and a turtle. My skin is " +  call to skin variable in parent utilitzing the super keyword. " I can hold my breath for " + call breath variable + " minutes."