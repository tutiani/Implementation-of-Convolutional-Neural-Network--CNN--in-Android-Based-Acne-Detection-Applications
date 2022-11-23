package com.detect.miupimp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val itemTitles = arrayOf("Acne Level 0",
            "Acne Level 1",
            "Acne Level 2",
            "Pustules",
            "Papules",
            "Nodules",
            "Cysts")
    private val itemDetails = arrayOf("Jerawat ini terdiri dari komedo yang sebagian besar di hidung, dan beberapa papula yang kecil, jerawat merah yang biasanya ditemukan di pipi. Jerawat ini minimal dan cenderung sesekali. Ini akan mengelupas kulit dengan lembut, membuka blokir pori-pori dan mencegah lebih banyak komedo\n" +
            "ToDo: \n• Gunakan pembersih yang baik untuk kulit berminyak. Pembersihan harus dilakukan dua kali sehari dan ditepuk kering\n" +
            "• Oleskan gel jerawat yang mengandung azelaic acid atau produk yang mengandung salicylic acid.\n " +
            "• Jika Indikasi jerawat didominasi  papules dan pustules enggunakan Retinoid dan Antimicrobal.",
            "Jerawat ini terdiri dari papules dan pustules dan terdapat peradangan ringan dan kadang-kadang pembengkakan ringan di daerah tersebut. Selain komedo putih, terdapat papula (benjolan berwarna kemerahan atau kulit yang ditinggikan ketika dirasa terasa kasar dan tidak beraturan) dan pustula (benjolan kecil atau lepuh yang diisi dengan bahan/nanah kekuningan) yang juga disebut jerawat.\n" +
            "ToDo: \n• Bersihkan wajah dua kali sehari dengan pembersih pengontrol minyak yang sesuai dan tepuk-tepuk inhalasi Uap kering\n" +
                    "• Jangan gunakan scrub untuk membersihkan wajah karena dapat lebih merusak kulit\n" +
                    "• Jangan meremas pustula karena kerusakan pada kulit dapat menyebabkan infeksi dan jaringan parut\n" +
                    "• Oleskan produk bebas yang mengandung benzoil peroksida, dua kali sehari\n",
            "Jerawat ini terdiri dari banyak nodul dan pustula nyeri yang besar serta beberapa nodul yang meradang.\n"+
            "Dalam menangani jerawat ini harus mencari perawatan dari dokter kulit untuk mengendalikan jerawat parah, membutuhkan antibiotik oral seperti kursus doxycycline atau minocycline selama sekitar 3 bulan untuk mengendalikan infeksi dari resep dokter\n"+
            "ToDo:\n • Hindari lingkungan berdebu dan paparan sinar matahari yang berlebihan\n" +
                    "• Gunakan gel yang diresepkan dokter, gel antibiotik topikal atau gel retinoid atau keduanya untuk mengendalikan jerawat. Karena kebijakan antibiotik, gel yang mengandung antibiotik tidak tersedia sebagai produk OTC.\n" +
                    "• Lakukan perawatan setidaknya 3 bulan untuk mencapai kontrol\n",
            "Pustules atau pustula benjolan kecil yang berwarna merah dengan bagian tengah berwarna putih atau kekuningan, Pustula jerawat berkisar dalam ukuran dari kecil hingga cukup besar. Mereka berkembang di daerah yang sama dengan papula dan biasanya di area wajah, punggung, dan bahu\n"+
            "ToDo: \n• Cuci area jerawat dengan sabun dengan lembut dua kali sehari. Gunakan kain bersih setiap kali.\n" +
            "• Oleskan perawatan yang dijual bebas seperti lotion calamine, krim kortison, salicylic acid, atau gel benzoyl peroxide.\n" +
            "• Jauhi produk yang dapat mengiritasi kulit Anda, seperti kosmetik atau tabir surya.\n" +
            "• Jangan menyentuh atau mengeluarkan pustula, karena dapat memperburuk kondisi dan menyebabkan infeksi atau jaringan parut.\n",
            "Papula noda yang meradang dan biasanya muncul di permukaan kulit terlihat seperti benjolan merah atau benjolan di kulit namun tidak memiliki bagian tengah putih.\n"+
            "ToDo:\n • Jangan meremas papula untuk mencoba dan membuatnya muncul keluar karena tidak akan menghilangkan bakteri jerawat dan hanya akan membuatnya lebih meradang.\n"+
                    "• Gunakan retinoids (vitamin A derivatives), salicylic acid, atau gel benzoyl peroxide and azelaic acid.\n",
            "Nodules atau nodul adalah jerawat meradang/ inflamasi benjolan keras dan menyakitkan terbentuk di bawah kulit dan benjolan merah muncul di permukaan kulit.\n"+
            "Untuk mengobati jerawat ini membutuhkan perawatan dari penyedia layanan kesehatan, resep obat oral dan krim topikal dapat membantu\n"+
            "ToDo: \n • Gunakan obat oral yang diresepkan seperti tetrasiklin (antibiotik) dan kontrasepsi oral dapat mengurangi peradangan, membersihkan jerawat nodular\n"+
            "• Gunakan benzoyl peroxide, salicylic acid, dan retinoids yang diresepkan.\n"+
            "• Lakukan suntikan kortison untuk mengecilkan nodul jerawat yang sangat besar, menyakitkan atau berlama-lama, penyedia perawatan  dapat merekomendasikan suntikan kortison. Dokter kulit akan menggunakan jarum halus untuk menyuntikkan obat steroid ke dalam nodul. Obat ini mengurangi peradangan dan mempercepat proses penyembuhan.",
            "Cysts atau cystic jerawat kistik meradang yang menyebabkan jerawat yang menyakitkan dan berisi nanah terbentuk jauh di bawah kulit\n"+"Terjadi ketika minyak dan sel kulit mati menyumbat pori-pori kulit. Kemudian, bakteri juga masuk ke pori-pori menyebabkan pembengkakan atau peradangan. Jerawat kistik adalah jenis jerawat yang paling parah\n"+
            "Jerawat ini sulit diobati, karena dapat menimbulkan bekas luka, kamu harus mencari bantuan dari dokter kulit daripada mencoba produk jerawat yang dijual bebas. Dokter kulit dapat mengajari kamu cara mengobati jerawat kistik.")
    private val itemImages = intArrayOf(
            R.drawable.levle0_100,
            R.drawable.uji12,
            R.drawable.uji23,
            R.drawable.pustules,
            R.drawable.papules,
            R.drawable.nodules,
            R.drawable.cysts
    )

    inner class ViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView
        var textTitle: TextView
        var textDes: TextView

        init {
            image = itemView.findViewById(R.id.item_img)
            textTitle = itemView.findViewById(R.id.item_title)
            textDes = itemView.findViewById(R.id.item_details)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_model,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles [position]
        holder.textDes.text = itemDetails [position]
        holder.image.setImageResource(itemImages [position])

        holder.itemView.setOnClickListener{ v: View ->

            Toast.makeText(v.context, "Click on the item", Toast.LENGTH_SHORT).show()
            
        }
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }

}