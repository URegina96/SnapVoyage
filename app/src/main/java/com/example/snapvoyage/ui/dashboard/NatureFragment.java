package com.example.snapvoyage.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.snapvoyage.R;

import androidx.annotation.Nullable;

import android.widget.ImageView;

public class NatureFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nature, container, false);

        ImageView natureImageView = view.findViewById(R.id.imageView);
        natureImageView.setImageResource(R.drawable.ic_launcher_foreground);


        return view;
    }
}

/**
 *Класс NatureFragment наследуется от Fragment, что позволяет ему быть частью пользовательского интерфейса приложения.
 *onCreateView — это метод жизненного цикла фрагмента, который вызывается для создания пользовательского интерфейса фрагмента.
Параметры метода:
LayoutInflater inflater — используется для "раздувания" (inflating) макета из XML-файла.
ViewGroup container — родительский контейнер, в который будет добавлен фрагмент (может быть null).
Bundle savedInstanceState — состояние фрагмента (может быть null).
 * Здесь мы используем LayoutInflater для создания представления фрагмента на основе XML-макета fragment_nature.xml.
container — это родительский контейнер, который может быть использован для добавления фрагмента, но в данном случае передается false, что означает, что фрагмент не будет добавлен сразу.
 * findViewById(R.id.imageView) — находит элемент ImageView в созданном представлении по его идентификатору imageView.
setImageResource(R.drawable.ic_launcher_foreground) — устанавливает изображение для ImageView из ресурсов приложения (в данном случае используется изображение ic_launcher_foreground).
 * Метод возвращает созданное представление фрагмента, которое будет отображено в пользовательском интерфейсе.

 * В итоге:
 * Класс NatureFragment представляет собой фрагмент, который создает пользовательский интерфейс, загружая макет из XML-файла fragment_nature.xml.
 В этом интерфейсе находится ImageView, в который загружается изображение из ресурсов приложения. Этот фрагмент можно использовать в других частях приложения для отображения контента, связанного с природой.
 */