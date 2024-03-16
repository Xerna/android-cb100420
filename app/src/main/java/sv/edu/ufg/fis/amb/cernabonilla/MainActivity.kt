package sv.edu.ufg.fis.amb.cernabonilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import sv.edu.ufg.fis.amb.cernabonilla.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar= findViewById<Toolbar>(R.id.toolbar)


        setSupportActionBar(toolbar)

        supportActionBar?.title="Cerna Bonilla"
        supportActionBar?.subtitle="Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)

        val boton = findViewById<Button>(R.id.btn);

        boton.setOnClickListener{
            val intent = Intent(this,SegundaPantalla::class.java);
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater .inflate(R.menu.ufg_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.configuracion->{
                Toast.makeText( this, "Usted ha seleccionado la opcion de configuracion ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.perfil->{
                Toast.makeText( this, "Usted ha seleccionado la opcion de perfil ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.mapa->{
                Toast.makeText( this, "Usted ha seleccionado la opcion de su ubicacion ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.nueva_cuenta->{
                Toast.makeText( this, "Usted ha seleccionado la opcion de una nueva cuenta ",Toast.LENGTH_LONG).show()
                true
            }
            R.id.salir->{
                Toast.makeText( this, "Usted ha seleccionado la opcion de salir de la app ",Toast.LENGTH_LONG).show()
                true
            }
            else -> false
        }

    }

}