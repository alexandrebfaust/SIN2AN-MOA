<?php
#Recursividade - Fatorial
#11!
function fatorial($n){
	if ($n == 1) {
		return $n;
	}
	else{
		return $n*fatorial($n-1);
	}
}
echo fatorial(11);
?>
