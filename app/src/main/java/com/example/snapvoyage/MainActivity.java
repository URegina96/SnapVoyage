package com.example.snapvoyage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем ссылку на нижнее меню
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);

        // Получаем NavController из NavHostFragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_activity_main);
        NavController navController = navHostFragment.getNavController();

        // Настраиваем нижнее меню с NavController
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}

/**
 * Класс MainActivity наследуется от AppCompatActivity, что позволяет использовать компоненты Material Design и поддержку различных версий Android.
 * onCreate — это метод жизненного цикла активности, который вызывается при создании активности.
 * setContentView(R.layout.activity_main); устанавливает макет интерфейса, определенный в XML-файле activity_main.xml.

 * Здесь мы находим BottomNavigationView по его идентификатору nav_view. Это меню будет использоваться для навигации между фрагментами приложения.

 * NavHostFragment — это контейнер для фрагментов, который управляет навигацией.
 * getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_activity_main); находит NavHostFragment по его идентификатору.
 * navController — это объект, который управляет навигацией в приложении, позволяя переходить между фрагментами.

 *  NavigationUI -> Этот метод связывает BottomNavigationView с NavController, что позволяет автоматически обрабатывать навигацию при нажатии на элементы нижнего меню.
 Это означает, что при выборе элемента меню будет происходить переход к соответствующему фрагменту.

 * Вся логика в этом коде направлена на настройку навигации в приложении с использованием нижнего меню. При запуске приложения будет отображаться activity_main.xml,
 а при нажатии на элементы нижнего меню будет происходить переход между фрагментами, управляемыми NavController.
 */