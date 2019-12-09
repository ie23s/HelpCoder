#!/bin/bash
if [ $1 == "1" ]
then
	cd $2
	rm ./version.properties
	git fetch https://ie23s:Iil3764a@github.com/ie23s/HelpCoder.git
	git checkout FETCH_HEAD -- ./version.properties
fi
if [ $1 == "2" ]
then
	cd $2
	git add -A && git commit -m $3
	git push https://ie23s:Iil3764a@github.com/ie23s/HelpCoder.git
fi
exit 0;
