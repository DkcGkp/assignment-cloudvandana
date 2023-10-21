// Sample array of numbers
const numbers = [5, 2, 9, 1, 5, 6, 3, 12, 19];

// Use the `sort` method with a custom comparison function
numbers.sort(function(a, b) {
    // To sort in descending order, subtract `b` from `a`.
    // If the result is negative, `a` comes before `b`.
    // If the result is positive, `b` comes before `a`.
    // If the result is 0, the order remains unchanged.
    return b - a;
});

// Display the sorted array in descending order
console.log("Sorted in descending order:", numbers);
