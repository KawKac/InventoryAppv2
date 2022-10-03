package pl.lanku.inventoryappv2.presentation.products

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.databinding.FragmentProductListBinding

class ProductList : Fragment() {

    companion object {
        fun newInstance() = ProductList()
    }

    private lateinit var viewModel: ProductListViewModel
    private lateinit var binding:FragmentProductListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_list, container, false)

       binding.productFragmentToForm.setOnClickListener {
           //TODO()
       }

    }

    override fun onViewCreated(context: Context?) {
        super.onViewCreated(context)
        viewModel = ViewModelProvider(this).get(ProductListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}