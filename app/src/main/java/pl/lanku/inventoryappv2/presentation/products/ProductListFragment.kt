package pl.lanku.inventoryappv2.presentation.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.databinding.FragmentProductListBinding

class ProductListFragment : Fragment() {

    companion object {
        fun newInstance() = ProductListFragment()
    }

    private lateinit var viewModel: ProductListViewModel
    private lateinit var binding: FragmentProductListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        viewModel = ViewModelProvider(this).get(ProductListViewModel::class.java)

        binding.productFragmentToForm.setOnClickListener {
            //TODO()
        }


        return inflater.inflate(R.layout.fragment_product_list, container, false)

    }

}