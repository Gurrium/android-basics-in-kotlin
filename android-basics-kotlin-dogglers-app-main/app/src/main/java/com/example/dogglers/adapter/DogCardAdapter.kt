/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    val dataset: List<Dog> = com.example.dogglers.data.DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val dogImageView: ImageView? = view?.findViewById(R.id.main_image)
        val nameTextView: TextView? = view?.findViewById(R.id.name_label)
        val ageTextView: TextView? = view?.findViewById(R.id.age_label)
        val hobbiesTexttView: TextView? = view?.findViewById(R.id.hobbies_label)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val layout = when (layout) {
            Layout.GRID -> R.layout.grid_list_item
            else -> R.layout.vertical_horizontal_list_item
        }

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(layout, parent, false)

        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.count()

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val data = dataset[position]
        holder.dogImageView?.setImageResource(data.imageResourceId)
        holder.nameTextView?.text = data.name
        val resources = context?.resources
        holder.ageTextView?.text = resources?.getString(R.string.dog_age, data.age)
        holder.hobbiesTexttView?.text = resources?.getString(R.string.dog_hobbies, data.hobbies)
    }
}
