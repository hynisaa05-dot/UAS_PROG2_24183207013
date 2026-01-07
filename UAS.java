/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo_J2
 */
abstract class UAS {
    protected String id;
    protected String nama;
    
    public UAS() {}
    
    public UAS(String id,String nama){
        this.id=id;
        this.nama=nama;
}
    public abstract void tampilInfo();
}
