echo -n "Enter your age"
read AGE

if [ $AGE -gt 0 ]
then
  for AG in {1..$AGE};
  do
  echo "You were once $AG years old"
  done
else 
echo "The age input should be greater than  zero"
fi
