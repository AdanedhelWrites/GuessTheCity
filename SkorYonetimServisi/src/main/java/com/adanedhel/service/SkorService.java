package com.adanedhel.service;

import com.adanedhel.manager.ISehirManager;
import com.adanedhel.rabbitmq.model.TahminModel;
import com.adanedhel.repository.ISkorRepository;
import com.adanedhel.repository.entity.Skor;
import com.adanedhel.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkorService extends ServiceManager{
    private final ISkorRepository skorRepository;
    @Autowired
    private ISehirManager sehirManager;
    public SkorService(ISkorRepository skorRepository) {
        super(skorRepository);
        this.skorRepository = skorRepository;
    }
    //BU METODDA EKSIKLIK VAR NEYIM EKSIK BULAMIYORUM BU METODU YORUMA ALICAM ALMAZSAM SYNTAX ERRORDEN DOLAYI ÇALIŞMICAKTIR BÖYLE'DE DÜZGÜN ÇALIŞMICAK
    public void skorGuncelle(TahminModel model){
//        Skor skor = skorRepository.findByuserId(model.getUserId());
//
//        int sayac= 0;
//        while (model.getDogruMu() == false && sayac < 5){
//            //alttaki kontrol kullanıcı tahmine boş bastıysa diye yapıldı
//            if (model.getUserTahmin() == null){
//                model.setDogruMu(false);
//                skor.setSkor(skor.getSkor()-5);
//                sayac ++;
//                //BİR ŞEYİM EKSİK VE SAATLERDİR ÇÖZEMİYORUM !!!
//            } else if (model.getUserTahmin() =! /*Tahmin dogru mu kontrolu yapmaya çalışıyorum buraya tahmin edilecek şehir gelmesi lazım BULAMIYORUM !!*/ ) {
//                model.setDogruMu(false);
//                skor.setSkor(skor.getSkor()-5);
//                sayac++;
//            }else{
//                skor.setSkor(skor.getSkor()+10);
//                model.setDogruMu(true);
//            }
//        }
    }
    public List<Skor> findByOrderBySkorAsc() {
        return skorRepository.findByOrderBySkorAsc();
    }
}
