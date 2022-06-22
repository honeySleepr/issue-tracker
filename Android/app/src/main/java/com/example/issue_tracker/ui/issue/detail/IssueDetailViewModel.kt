package com.example.issue_tracker.ui.issue.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.issue_tracker.domain.model.*
import java.time.LocalDateTime

class IssueDetailViewModel:ViewModel() {

    private val _issueDetail = MutableLiveData<IssueDetail>()
    val issueDetail:LiveData<IssueDetail> = _issueDetail

    fun loadDetail(id:Int){
        _issueDetail.value = IssueDetail("테스트이슈", true, LocalDateTime.of(2022,6,22,15,15,10),User(1,"Sam","https://images.unsplash.com/photo-1655057011043-158c48f3809d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHx0b3BpYy1mZWVkfDEyfHhqUFI0aGxrQkdBfHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"),makeDummyComments())
    }

    private fun makeDummyComments():List<Comment>{
        val comments = mutableListOf<Comment>()
        comments.add(MyComment(User(1,"Sam","https://images.unsplash.com/photo-1655057011043-158c48f3809d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHx0b3BpYy1mZWVkfDEyfHhqUFI0aGxrQkdBfHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"),LocalDateTime.of(2022,6,22,14,10,3).toString(),"테스트 커멘트"))
        comments.add(OtherComment(User(2,"Daniel","https://images.unsplash.com/photo-1655057011043-158c48f3809d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHx0b3BpYy1mZWVkfDEyfHhqUFI0aGxrQkdBfHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"),LocalDateTime.of(2022,6,22, 12,10,3).toString(),"테스트 커멘트"))
        comments.add(OtherComment(User(2,"Daniel","https://images.unsplash.com/photo-1655057011043-158c48f3809d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHx0b3BpYy1mZWVkfDEyfHhqUFI0aGxrQkdBfHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"),LocalDateTime.of(2022,6,22,12,10,3).toString(),"테스트 커멘트"))
        return comments
    }
}