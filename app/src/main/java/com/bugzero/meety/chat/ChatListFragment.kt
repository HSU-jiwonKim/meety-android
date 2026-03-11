package com.bugzero.meety.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bugzero.meety.R

class ChatListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chat_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.chat_item_1).setOnClickListener {
            findNavController().navigate(R.id.action_chatList_to_chatRoom)
        }
        view.findViewById<View>(R.id.chat_item_2).setOnClickListener {
            findNavController().navigate(R.id.action_chatList_to_chatRoom)
        }
        view.findViewById<View>(R.id.chat_item_3).setOnClickListener {
            findNavController().navigate(R.id.action_chatList_to_chatRoom)
        }
    }
}