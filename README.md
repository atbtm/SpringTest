# SpringTest
Spring bean injection training. Will add Spring AOP training later..

This is the training space for me to educate myself Spring bean injection and in future, Spring AOP.

Notes..

- Config by xml. ByName (match by id) & ByType (match by path/package)
- Inner beans
- Autowiring
- Config by Annotation. 
  1. @Required: force to config, o/w throw exception
  2. @Autowired: matches bean by type
  3. @Qualifier: dis-ambiguous when multiple beans having same path, then match by given id
- Config by Java config file
- Can inject from constructor param, by fields (if autowired), and by method
