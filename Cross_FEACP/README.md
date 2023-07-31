<h1 align="justify">Data mining for high-utility itemsets in Brazilian Ecommerce: An efficiency-maximizing approach</h1>

## Usage

1. Clone the repository
    ```bash
    git clone git@github.com:esvm4/225IS1401.git
    cd 225IS1401
    ```
2. Initialise a virtual environment
    ```bash
    python3 -m venv .venv
    source venv/bin/activate # Linux, choose your shell version
    # If you are not using Linux, please refer to the official documentation
    ```
3. Install the requirements
    ```bash
    pip install -r requirements.txt
    ```
4. Move to the Cross_FEACP folder

```bash
cd Cross_FEACP
```

5.  Organise data
    -   Download data from this [link](https://www.kaggle.com/datasets/olistbr/brazilian-ecommerce)
    -   Store them in the `data/` folder
6.  Run the `inputFormatting` notebook to generate standardised data
7.  Import the `processing` project into Eclipse and run the `Main.java` file
8.  Run the `outputFormatting` notebook to visualise the final results

---

## Acknowledgements

Fournier-Viger, P., Gomariz, A., Gueniche, T., Soltani, A., Wu, C. W., & Tseng, V. S. (2014). Spmf: a java open-source pattern mining library. J. Mach. Learn. Res., 15(1), 3389-3393.

Tung, N. T., Nguyen, L. T., Nguyen, T. D., Fourier-Viger, P., Nguyen, N. T., & Vo, B. (2022). Efficient mining of cross-level high-utility itemsets in taxonomy quantitative databases. Information Sciences, 587, 41-62.

Thanks to Olist for releasing this dataset.
Olist, &amp; André Sionek. (2018). <i>Brazilian E-Commerce Public Dataset by Olist</i> [Data set]. Kaggle. https://doi.org/10.34740/KAGGLE/DSV/195341
