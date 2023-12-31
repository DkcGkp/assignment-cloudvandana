function descendingBubbleSort(arr) {
    let len = arr.length; // Get the length of the array
    let swapped; // Initialize a variable to track if any swaps are made

    do {
        swapped = false; // Reset the "swapped" flag to false

        for (let i = 0; i < len - 1; i++) {
            if (arr[i] < arr[i + 1]) { // Compare adjacent elements
                // Swap elements if they are in the wrong order (ascending)
                let temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true; // Set the "swapped" flag to true
            }
        }
    } while (swapped); // Continue looping until no more swaps are made

    return arr; // Return the sorted array in descending order
}

const myArray = [5, 2, 9, 1, 5, 6, 8, 15, 0];
descendingBubbleSort(myArray);
console.log(myArray); // Outputs: [5, 2, 9, 1, 5, 6, 8, 15, 0]

