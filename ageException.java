class ageException extends Exception
{
	String str;
 ageException(String s)
 {
   str=s;
 }
 public String toString()
 {
  return ("age exception occured because "+str);
 }
}

