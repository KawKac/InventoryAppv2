package pl.lanku.inventoryappv2.presentation.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.databinding.FragmentAddNewProductBinding

class AddNewProductFragment : Fragment() {

    //    private val viewModel by viewModels<AddNewProductViewModel>()
    private var _binding: FragmentAddNewProductBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddNewProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.formFragmentToProductList.setOnClickListener {
            findNavController().navigate(R.id.action_addNewProductFragment_to_productListFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        _binding = FragmentAddNewProductBinding.inflate(layoutInflater)
//
//        addNewRowToDatabase()
//    }
//
//    private fun addNewRowToDatabase() {
//        _binding.buttonSaveNewProduct.setOnClickListener {
//            viewModel.eanOrIan = _binding.editTextEanOrIan.getText().toString()
//            viewModel.productName = _binding.editTextProductName.getText().toString()
//            viewModel.productCategory = _binding.editTextProductCategory.getText().toString()
//            viewModel.insertDataToDatabase(
//                viewModel.eanOrIan,
//                viewModel.productName,
//                viewModel.productCategory
//            )
//            clearEditText()
//        }
//    }
//
//    private fun clearEditText() {
//        _binding.editTextEanOrIan.text.clear()
//        _binding.editTextProductName.text.clear()
//        _binding.editTextProductCategory.text.clear()
//    }

}