package jp.hideakisago.androidworkshopsamplegit.ui.sub

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.hideakisago.androidworkshopsamplegit.R

class SubFragment : Fragment() {
    companion object {
        fun newInstance() = SubFragment()
    }

    private lateinit var viewModel: SubViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sub_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SubViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
