#!/bin/bash

# Fungsi untuk mengencode dan mendecode teks menggunakan Rot13
function rot13() {
  local input=$1
  local output=$(echo "$input" | tr 'A-Za-z' 'N-ZA-Mn-za-m')
  echo "$output"
}

# Periksa apakah ada argumen yang diberikan
if [ "$#" -eq 0 ]; then
  echo "Usage: $0 <text>"
  exit 1
fi

# Panggil fungsi rot13 dengan teks yang diberikan sebagai argumen
rot13 "$1"
