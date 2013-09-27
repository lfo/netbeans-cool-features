netbeans-cool-features
======================


## Compile On Save (CoS) on Netbeans 7.4

  The cos-modules project illustrate the ability of Netbeans described here : http://wiki.netbeans.org/FaqCompileOnSave#Using_Compile_on_Save_in_Maven_Projects
 
  To make it run, 
  
   * Install a Netbeans 7.4 releases without anymore plugin
  
   * Get the source 
   
        git clone git@github.com:lfo/netbeans-cool-features.git
        git checkout feature/cos-nb74

    with netbeans, go to the menu team/git/clone...
    ![clone] [clone]
    ![checkout] [checkout]

   * Open in netbeans the cos-modules pom project and its required project moduleA and moduleB
     ![open] [open]
   * Make a primary build
   * Run the ModuleACoSDependencyTest (right click on the test), it should pass.
     ![run] [run]
   * Open ServiceA.java in the moduleA in order to make the previous test failed and save the file.
   * Open ModuleACoSDependencyTest.java right click on the test method and choose "Run focus test method"
     ![runSingle]
   

[clone]:https://github.com/lfo/netbeans-cool-features/raw/master/statics/2013-09-27%2016_16_48-NetBeans%20IDE%20Dev%20201309270002.png
[checkout]: https://github.com/lfo/netbeans-cool-features/raw/master/statics/2013-09-27%2016_17_53-NetBeans%20IDE%20Dev%20201309270002.png
[open]:https://github.com/lfo/netbeans-cool-features/raw/master/statics/2013-09-27%2016_19_13-NetBeans%20IDE%20Dev%20201309270002.png
[run]:https://github.com/lfo/netbeans-cool-features/raw/master/statics/2013-09-27%2016_54_39-moduleB%20-%20NetBeans%20IDE%20Dev%20201309270002.png
[runSingle]:https://github.com/lfo/netbeans-cool-features/raw/master/statics/2013-09-27%2016_56_26-moduleB%20-%20NetBeans%20IDE%20Dev%20201309270002.png
 
    
 
    
    
