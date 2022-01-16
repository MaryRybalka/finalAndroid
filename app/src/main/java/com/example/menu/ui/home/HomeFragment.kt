package com.example.menu.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.menu.R
import com.example.menu.databinding.FragmentHomeBinding
import com.squareup.picasso.Picasso

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val imageView1: ImageView = binding.imageHome
        Picasso.get()
            .load("https://www.navalhistory.org/wp-content/uploads/2018/04/9-USS-New-Mexico-cat-350x252.jpg")
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .into(imageView1);

        val imageView2: ImageView = binding.secondImageHome
        Picasso.get()
            .load("https://www.navalhistory.org/wp-content/uploads/2018/04/12-Pooli-329x350.jpg")
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .into(imageView2);

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}