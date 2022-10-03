package pl.lanku.inventoryappv2.presentation.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.databinding.MainFragmentBinding

class MainFragment : Fragment(R.layout.main_fragment) {
    private val viewModel by viewModels<MainFragmentViewModel>()
    private lateinit var binding: MainFragmentBinding

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

        addNewRowToDatabase()
    }

    private fun addNewRowToDatabase() {
        binding.buttonSaveNewProduct.setOnClickListener {
            viewModel.eanOrIan = binding.editTextEanOrIan.getText().toString()
            viewModel.productName = binding.editTextProductName.getText().toString()
            viewModel.productCategory = binding.editTextProductCategory.getText().toString()
            viewModel.insertDataToDatabase(
                viewModel.eanOrIan,
                viewModel.productName,
                viewModel.productCategory
            )
            clearEditText()
        }
    }

    private fun clearEditText() {
        binding.editTextEanOrIan.text.clear()
        binding.editTextProductName.text.clear()
        binding.editTextProductCategory.text.clear()
    }

}