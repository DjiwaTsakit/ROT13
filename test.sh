#!/bin/bash

# Fungsi untuk mengencode teks menggunakan Rot13
function encode_rot13() {
  local input=$1
  local output=""
  local char

  for ((i=0; i<${#input}; i++)); do
    char=${input:$i:1}
    case $char in
      [a-z]) new_char=$(echo "$char" | tr 'a-z' 'n-z')
              ;;
      [A-Z]) new_char=$(echo "$char" | tr 'A-Z' 'N-Z')
              ;;
      *) new_char=$char
              ;;
    esac
    output+=$new_char
  done
  echo "$output"
}

# Fungsi untuk mendecode teks menggunakan Rot13
function decode_rot13() {
  local input=$1
  local output=""
  local char

  for ((i=0; i<${#input}; i++)); do
    char=${input:$i:1}
    case $char in
      [n-z]) new_char=$(echo "$char" | tr 'n-z' 'a-z')
              ;;
      [N-Z]) new_char=$(echo "$char" | tr 'N-Z' 'A-Z')
              ;;
      *) new_char=$char
              ;;
    esac
    output+=$new_char
  done
  echo "$output"
}
