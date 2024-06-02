#!/bin/bash

# Fungsi untuk mengencode dan mendecode teks menggunakan Rot13
function rot13() {
  local input=$1
  local output=$(echo "$input" | tr 'A-Za-z' 'N-ZA-Mn-za-m')
  echo "$output"
}

# Contoh penggunaan
input="Hello, World!"
echo "Input: $input"

encoded=$(rot13 "$input")
echo "Encoded: $encoded"

decoded=$(rot13 "$encoded")
echo "Decoded: $decoded"
