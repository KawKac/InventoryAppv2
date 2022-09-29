package pl.lanku.inventoryappv2.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.databinding.MainFragmentBinding
import pl.lanku.inventoryappv2.presentation.products.InventoryViewModel

class MainFragment : Fragment() {
    private var viewModel: InventoryViewModel by viewModel()
    lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainFragmentBinding.inflate(layoutInflater)

        binding.buttonProductList.setOnClickListener {

        }
    }
}