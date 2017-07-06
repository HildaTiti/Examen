#include <iostream>
#include "Duo.h"
using namespace std;

int main()
{ int n, m;
    cout<<"Ingrese el valor menor: ";
    cin>>n;
    cout<<"Ingrese el valor mayor: ";
    cin>>m;
    Duo *obj = new Duo(n,m);
      cout<<"\n"<<"Distancia es: "<<endl;
      obj->hallarDistancia();
      cout<<"\n"<<"Hipotenusa es: "<<endl;
      obj->hallarHipotenusa();
      cout<<"\n"<<"Rango es: "<<endl;
      obj->imprimirRango();
      cout<<"\n"<<"Impares es: "<<endl;
      obj->mostrarImpares();
      cout<<"\n"<<"Pares es: "<<endl;
      obj->mostrarPares();
      cout<<"\n"<<"Los numeros primos es: "<<endl;
      obj->primosRango();

    return 0;
}

