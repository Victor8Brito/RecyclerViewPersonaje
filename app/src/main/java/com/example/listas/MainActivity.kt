package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listas.adaptador.PersonajeAdapter
import com.example.listas.modelo.Personaje

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonajes = ArrayList<Personaje>()

        listaPersonajes.add(Personaje("Manuel Never","https://static.dw.com/image/53518754_303.jpg"))
        listaPersonajes.add(Personaje("Alexander Arnold","https://assets-es.imgfoot.com/media/cache/1200x900/asistencias%20alexander%20arnold.jpg"))
        listaPersonajes.add(Personaje("Marquinhos","https://estaticos-cdn.sport.es/clip/53124821-fdcf-41d4-83bf-dcc21f6fac41_alta-libre-aspect-ratio_default_0.jpg"))
        listaPersonajes.add(Personaje("Virgil Van Dijk","https://st1.uvnimg.com/e5/d1/917c9d374d498b21a4ac6e4738ec/virgil-van-dijk.jpg"))
        listaPersonajes.add(Personaje("Alphonso Davies","https://radiosportsmtl.com/wp-content/uploads/2021/03/Alphonso-Davies.jpg"))
        listaPersonajes.add(Personaje("Ngolo Kante","https://kashishroy.com/wp-content/uploads/2022/03/NGolo-Kante-1024x576.jpg"))
        listaPersonajes.add(Personaje("Kevin De Bruyne","https://as.com/futbol/imagenes/2022/04/21/internacional/1650493909_343933_1650494159_noticia_normal_recorte1.jpg"))
        listaPersonajes.add(Personaje("Frenkie De Jonh","https://www.fcbarcelonanoticias.com/uploads/s1/12/95/92/3/frenkie-de-jong-con-el-barcelona.jpeg"))
        listaPersonajes.add(Personaje("Lionel Messi","https://www.futbolred.com/files/article_main/uploads/2022/04/19/625f36b6bb86c.jpeg"))
        listaPersonajes.add(Personaje("Kylian Mbappe","https://assets-es.imgfoot.com/media/cache/642x382/mbappebordeaux.jpg"))
        listaPersonajes.add(Personaje("Robert Lewandowski","https://cms.somosfanaticos.com/__export/1652890947765/sites/fanaticos/img/2022/05/18/gettyimages-1397215468_crop1652890945948.jpg_1624932088.jpg"))

        miRecycler = findViewById(R.id.RecyclerPersonajes)
        miRecycler.adapter= PersonajeAdapter(listaPersonajes)
        miRecycler.layoutManager =LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}