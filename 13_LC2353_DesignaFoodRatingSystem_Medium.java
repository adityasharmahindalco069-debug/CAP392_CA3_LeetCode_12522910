class Food {
    String foodName;
    String cuisine;
    int rating;

    public Food(String food, String cuisine, int rating) {
        this.foodName = food;
        this.cuisine = cuisine;
        this.rating = rating;
    }
}

class FoodRatings {

    Map<String, Food> foodNameMap = new HashMap<>();
    Map<String, TreeSet<Food>> foodMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n = foods.length;
        for (int i = 0; i < n; i++) {
            foodMap.putIfAbsent(cuisines[i], new TreeSet<>((Food food1, Food food2) -> {
                if (food1.rating == food2.rating) {
                    return food1.foodName.compareTo(food2.foodName);
                }
                return Integer.compare(food2.rating, food1.rating);
            }));
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodMap.get(cuisines[i]).add(food);
            foodNameMap.put(food.foodName, food);
        }
    }

    public void changeRating(String food, int newRating) {
        Food foodObj = foodNameMap.get(food);
        foodMap.get(foodObj.cuisine).remove(foodObj);
        foodObj.rating = newRating;
        foodMap.get(foodObj.cuisine).add(foodObj);
    }

    public String highestRated(String cuisine) {
        return foodMap.get(cuisine).first().foodName;
    }
}
