package com.adi.mynotes.helper

import androidx.recyclerview.widget.DiffUtil
import com.adi.mynotes.database.Note

class NoteDiffCallback(private val mNoteOldList: List<Note>, private val mNewNotesList: List<Note>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return mNoteOldList.size
    }

    override fun getNewListSize(): Int {
        return mNewNotesList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return mNoteOldList[oldItemPosition].id == mNewNotesList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = mNoteOldList[oldItemPosition]
        val newEmployee = mNewNotesList[newItemPosition]
        return oldEmployee.title == newEmployee.title && oldEmployee.description == newEmployee.description
    }

}