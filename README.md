# Classe DialogProgress ->

class  DialogProgress ( val  context :  Context ) {

     diálogo divertido (): Dialog {
        val mDialog =  Diálogo (contexto)
        mDialog.setContentView ( R .layout.layout_loanding_progress)
        mDialog.show ()
        return mDialog
    }
}

# Main Activity ->

classe  MainActivity : AppCompatActivity () {

    private  lateinit  var mBinding :  ActivityMainBinding
    private  lateinit  var mLoanding :  Dialog

    substituir  fun  onCreate ( savedInstanceState :  Bundle ? ) {
        mBinding =  ActivityMainBinding .inflate (layoutInflater)
        super .onCreate (savedInstanceState)
        setContentView (mBinding.root)
        mLoanding =  DialogProgress ( this ) .dialog ()
    }

    override  fun  onResume () {
        super .onResume ()
        initbutton()
       // Ocultar caixa de diálogo na inicialização ->
        mLoanding.hide ()

    }

     private fun initbutton () {
        mBinding.button.setOnClickListener {
            // SIMULANDO ATIVAÇÃO DO DIÁLOGO ->
            mLoanding.show ()
            Handler () .postDelayed ({
                mLoanding.hide ()
            }, 5000 )
        }
    }

    // CONSEGUINDO ASSIM PARA 2 OPÇÕES, MOSTRE E SE ESCONDER!
      // mLoanding.hide () --- mLoanding.show


}



