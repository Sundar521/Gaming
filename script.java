let randomNumber = Math.floor(Math.random() * 10) + 1;

function check() {
  let userGuess = document.getElementById("userInput").value;
  let result = document.getElementById("result");

  if (userGuess == randomNumber) {
    result.innerHTML = "🎉 Correct! You win!";
  } else {
    result.innerHTML = "❌ Wrong! Try again.";
  }
}
