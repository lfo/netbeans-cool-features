netbeans-cool-features
======================


## Compile On Save (CoS) on Netbeans 7.4

  The cos-modules project illustrate the ability of Netbeans described here : http://wiki.netbeans.org/FaqCompileOnSave#Using_Compile_on_Save_in_Maven_Projects
 
  To make it run, 
  
   * Install a Netbeans 7.4 releases without anymore plugin
  
   * Get the source 
   
        git clone git@github.com:lfo/netbeans-cool-features.git
     
     with netbeans, go to the menu team/git/clone...

   * Open in netbeans the cos-modules pom project and its required project moduleA and moduleB
   * Make a primary build
   * Run the ModuleACoSDependencyTest (right click on the test)
   * Open ServiceA.java in the moduleA in order to make the previous test failed and save the file.
   * Open ModuleACoSDependencyTest.java right click on the test method and choose "Run focus test method"
   * 
   

  
    
 
    
    
