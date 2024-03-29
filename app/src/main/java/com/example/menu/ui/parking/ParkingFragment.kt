package com.example.menu.ui.parking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menu.R
import com.example.menu.databinding.FragmentParkingBinding
import com.example.menu.viewmodels.SingleItemController

class ParkingFragment : Fragment() {

    private lateinit var parkingViewModel: ParkingViewModel
    private var _binding: FragmentParkingBinding? = null

    private val binding get() = _binding!!

    private val singleItemController: SingleItemController by lazy { SingleItemController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        parkingViewModel =
            ViewModelProvider(this)[ParkingViewModel::class.java]

        _binding = FragmentParkingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textParking
        parkingViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        initRecycler()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRecycler() : Boolean{
        val linearLayoutManager = LinearLayoutManager(activity)
        var lm: RecyclerView.LayoutManager?
        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.apply {
            layoutManager = linearLayoutManager
            lm = layoutManager
            setHasFixedSize(true)
            adapter = singleItemController.adapter
            addItemDecoration(
                DividerItemDecoration(
                    activity,
                    linearLayoutManager.orientation
                )
            )
        }

        singleItemController.requestModelBuild()
        return (lm?.childCount!! > 0)
    }
}