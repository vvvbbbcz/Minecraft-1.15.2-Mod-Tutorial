gitbook build
rm ./_book/build.sh
rm ./_book/LICENSE
rm -r ./_book/docs
rm -r ./docs/*
cp -r ./_book/* ./docs/
rm -r ./_book
