# FP LBE Alpro 2022

- Fork repositori ini
- Ubah isi repository ini sehingga dapat diperlihatkan konsep:
  - *inheritance*
  - enkapsulasi
  - abstraksi
  - *polymorphism*
- Perlihatkan implementasi konsep diatas pada README ini.
- Gunakan nama *class* yang sudah ada sebagai tema dari project ini.

Catatan: Program tidak harus dapat dijalankan, cukup ditunjukkan implementasi konsepnya saja.

##inheritance :

class telephoneiphone extends telephone {
  
    public int memory;
 
    public telephoneiphone(int ram, int memory1)
    {

        back(ram);
        memory = memory1;
    }
 
    @Override public String toString()
    {
        return (back.toString() +" and"
                + memory +"gb of memory");
    }
} 

enkapsulasi :

private class telephoneandroid extends telephone { //encapsulation - private
  
    public string OS;
 
    public telephoneandroid(int ram, int memory1,string OS1)
    {

        software(ram, memory);
        OS = OS1;
    }
 
 
    @Override public String toString()
    {
        return (software.toString() +" but android has "
                + memory +" as the OS");
    }
}
