package com.example.hackgsu19.Profile

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.hackgsu19.R
import com.example.hackgsu19.Report


class ProfileRecyclerAdapter: RecyclerView.Adapter<ProfileRecyclerAdapter.ViewHolder>() {

    private val mProfileList = Report.profileCardList

    inner class ViewHolder(cardView: View) : RecyclerView.ViewHolder(cardView) {

        var cardImage: ImageView
        var cardName: TextView
        var cardDetail: TextView
        var cardDate: TextView
        var cardOrg: TextView

        init {
            cardImage = cardView.findViewById(R.id.card_image)
            cardName = cardView.findViewById(R.id.card_name)
            cardDetail = cardView.findViewById(R.id.card_detail)
            cardDate = cardView.findViewById(R.id.card_date)
            cardOrg = cardView.findViewById(R.id.card_org)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        var mReport: Report = mProfileList[i]
        viewHolder.cardName.text = mReport.name
        viewHolder.cardDetail.text = mReport.detail
        viewHolder.cardDate.text = mReport.date
        viewHolder.cardOrg.text = mReport.org
        viewHolder.cardImage.setImageResource(mReport.image)
    }

    override fun getItemCount(): Int {
        return mProfileList.size
    }
}