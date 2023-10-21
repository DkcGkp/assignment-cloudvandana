function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");

    // Iterate through the words, reverse each word, and store the reversed words
    let reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
