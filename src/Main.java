package main.java;

public class Main {
	public static void main(String[] args) {
    RewardValue rewardValue1 = new RewardValue(100); // 100 miles
    RewardValue rewardValue2 = new RewardValue(500); // 500 miles
    RewardValue rewardValue3 = new RewardValue(35.0); // $35.0

    // Displaying cash value and miles value for each RewardValue instance
    System.out.println("RewardValue 1:");
    System.out.println("Cash Value: $" + rewardValue1.getCashValue());
    System.out.println("Miles Value: " + rewardValue1.getMilesValue() + " miles");

    System.out.println("\nRewardValue 2:");
    System.out.println("Cash Value: $" + rewardValue2.getCashValue());
    System.out.println("Miles Value: " + rewardValue2.getMilesValue() + " miles");

    System.out.println("\nRewardValue 3:");
    System.out.println("Cash Value: $" + rewardValue3.getCashValue());
    System.out.println("Miles Value: " + rewardValue3.getMilesValue() + " miles");
	}
}
