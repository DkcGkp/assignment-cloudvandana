let displayValue = "";

// Function for displaying numerics
function appendToDisplay(value) {
  displayValue += value;
  document.getElementById("display").value = displayValue;
}

// Function for clearing display
function clearDisplay() {
  displayValue = "";
  document.getElementById("display").value = displayValue;
}

// Function to show calculated result
function calculateResult() {
  // used try/catch to find and display error
  try {
    displayValue = eval(displayValue);
    document.getElementById("display").value = displayValue;
  } catch (error) {
    document.getElementById("display").value = "Error";
  }
}
