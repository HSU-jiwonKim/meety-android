package com.bugzero.meety.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bugzero.meety.R

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 로그인 버튼 → 온보딩으로
        view.findViewById<View>(R.id.btn_login).setOnClickListener {
            findNavController().navigate(R.id.action_login_to_onboarding)
        }

        // 회원가입 버튼 → 온보딩으로
        view.findViewById<View>(R.id.btn_signup).setOnClickListener {
            findNavController().navigate(R.id.action_login_to_onboarding)
        }
    }
}