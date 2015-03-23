# Phoebe
szoftlab4 szkeleton

könyvtár hierarchia:
├───bin
└───src
    └───Phoebe
            Field.java
            GameManager.java
            Goo.java
            Jumping.java
            Landable.java
            Map.java
            NormalField.java
            Oil.java
            OutsideField.java
            README.md
            Robot.java
            RobotState.java
            Trap.java
            VelocityVector.java

Fordítás:
A gyökér könyvtárban shift + jobb klikk, parancsablak nyitása itt, majd: javac -d bin src/Phoebe/*.java

Futtatás:
A gyökér könyvtárban parancsablak nyitása, majd:            cd bin
                                                            java Phoebe.GameManager <indítási paraméterek>

Indítási paraméterek:
A kacsacsőrők nem kellenek
                                                            new
                                                            end
                                                            jump normal
                                                            jump outside
                                                            jump robot
                                                            jump oil
                                                            jump goo
                                                            place oil
                                                            place goo

