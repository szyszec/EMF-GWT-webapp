EMF-GWT-webapp
==============
##Environment setup before importing the project
To setup your environment please follow the [EMF/GWT tutorial](https://wiki.eclipse.org/EMF/GWT). Use [this update site](http://download.eclipse.org/modeling/emf/emf/updates/releases/) for both EMF and the target platform.
##If you want to follow the tutorial instead
Once you're done with the tutorial, edit the _appengine-web.xml_ file. Add the following line:

    <threadsafe>1</threadsafe>
###EntryPoint changes
In progress...

###Final steps
I had to add one dependency to the manifest, as Ed Merks describes in [this message](http://www.eclipse.org/forums/index.php/mv/msg/647003/1255543/#msg_1255543).