<h1 align="justify">Predictive Analysis of Multivariate Gait Data Using Data Mining Techniques for Biomechanical Assessment</h1>

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
4. Organise data
    - Download data from this [link](https://archive.ics.uci.edu/static/public/760/multivariate+gait+data.zip)
    - Unzip and place it in the `Analysis` folder
5. Run the `preprocessing` notebook to generate standardised data
6. All models are placed in the `Models` folder for viewing and testing purposes

---

## Acknowledgements

The data were collected by Shorter et al. (2008), preprocessed by Helwig et al. (2011), and published by Helwig et al. (2016).

Shorter, K. A., Polk, J. D., Rosengren, K. S., Hsiao-Wecksler, E. T. (2008). A new approach to detecting asymmetries in gait. Clinical Biomechanics. 23(4), 459-467. https://doi.org/10.1016/j.clinbiomech.2007.11.009

Helwig, N. E., Hong, S., Hsiao-Wecksler E. T., & Polk, J. D. (2011). Methods to temporally align gait cycle data. Journal of Biomechanics, 44(3), 561-566. https://doi.org/10.1016/j.jbiomech.2010.09.015

Helwig, N. E., Shorter, K. A., Ma, P. & Hsiao-Wecksler, E. T. (2016). Smoothing spline analysis of variance models: A new tool for the analysis of cyclic biomechanical data. Journal of Biomechanics, 49(14), 3216-3222. https://doi.org/10.1016/j.jbiomech.2016.07.035
